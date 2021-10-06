import logo from "./logo.svg";
import "./App.css";
import { useState } from "react";

function Item({ value }) {
  if (value === -1) {
    return ".";
  } else if (value === 0) {
    return "O";
  } else {
    return "X";
  }
}

function App() {
  let emptyBoard = [
    [-1, -1, -1],
    [-1, -1, -1],
    [-1, -1, -1],
  ];

  let [board, setBoard] = useState(emptyBoard);
  let [player, setPlayer] = useState(0);
  let [steps, setSteps] = useState(0);
  let [gameOver, setGameOver] = useState(false);
  let [gameText, setGameText] = useState("");

  let gameState = function (state, rowi, coli, player, steps) {
    let count = 0;
    for (let r = 0; r < 3; r++) {
      if (state[r][coli] === player) {
        count += 1;
      }
    }

    if (count === 3) {
      return "win";
    }

    count = 0;
    for (let c = 0; c < 3; c++) {
      if (state[rowi][c] === player) {
        count += 1;
      }
    }
    if (count === 3) {
      return "win";
    }

    count = 0;
    for (let r = 0; r < 3; r++) {
      if (state[r][r] === player) {
        count += 1;
      }
    }
    if (count === 3) {
      return "win";
    }

    count = 0;
    for (let r = 0; r < 3; r++) {
      if (state[r][2 - r] === player) {
        count += 1;
      }
    }
    if (count === 3) {
      return "win";
    }

    if (steps === 9) {
      return "draw";
    }

    return "nothing";
  };

  return (
    <div className="App">
      <header className="App-header">
        {board.map(function (row, rowi) {
          return (
            <div key={rowi}>
              {row.map(function (item, coli) {
                return (
                  <button
                    disabled={gameOver}
                    className="gamebuttons"
                    onClick={function () {
                      if (board[rowi][coli] === -1) {
                        let copy = [...board];
                        copy[rowi][coli] = player;
                        setBoard(copy);

                        let state = gameState(
                          copy,
                          rowi,
                          coli,
                          player,
                          steps + 1
                        );

                        if (state === "win" || state === "draw") {
                          setGameOver(true);

                          if (state === "win") {
                            setGameText(player + " won the game");
                          } else {
                            setGameText("This was a draw");
                          }
                        }

                        setPlayer(Math.abs(player - 1));
                        setSteps(steps + 1);
                      }
                    }}
                    key={coli}
                  >
                    <Item value={board[rowi][coli]} />
                  </button>
                );
              })}
            </div>
          );
        })}

        <h1>{gameText}</h1>
        {gameOver && (
          <button
            onClick={function () {
              setBoard(emptyBoard);
              setPlayer(0);
              setSteps(0);
              setGameOver(false);
              setGameText("");
            }}
          >
            Reset the game
          </button>
        )}
      </header>
    </div>
  );
}

export default App;
