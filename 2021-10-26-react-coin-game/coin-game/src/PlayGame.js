import { useEffect, useState } from "react";
import "./gameboard.css";
import { Bomb } from "./models/bombs";
import { Coin } from "./models/coin";

export default function PlayGame() {
  let [coins, setCoins] = useState([]);
  let [bombs, setBombs] = useState([]);
  let [score, setScore] = useState(0);

  useEffect(function () {
    setInterval(() => {
      let coin = new Coin();
      setCoins(function (oldval) {
        let copy = [...oldval];
        copy.push(coin);
        return copy;
      });

      let bomb = new Bomb();
      setBombs(function (oldval) {
        let copy = [...oldval];
        copy.push(bomb);
        return copy;
      });
    }, 100);

    setTimeout(() => {
      setInterval(() => {
        setCoins(function (oldval) {
          let copy = [...oldval];
          copy.shift();
          return copy;
        });

        setBombs(function (oldval) {
          let copy = [...oldval];
          copy.shift();
          return copy;
        });
      }, 100);
    }, 3000);
  }, []);

  return (
    <div className="gameboard">
      <h1 className="score">Score : {score}</h1>
      {coins.map(function (coin, index) {
        return (
          coin.avail && (
            <img
              key={index}
              className="coin"
              src="/images/coin.png"
              style={{
                top: coin.top + "px",
                left: coin.left + "px",
              }}
              onMouseOver={function () {
                let audio = new Audio("/audio/coin.mp3");
                setScore((oldval) => oldval + 10);
                audio.play();
                coin.avail = false;
                setCoins([...coins]);
              }}
            />
          )
        );
      })}

      {bombs.map(function (bomb, index) {
        return (
          bomb.avail && (
            <img
              key={index}
              className="bomb"
              src="/images/bomb.png"
              style={{
                top: bomb.top + "px",
                left: bomb.left + "px",
              }}
              onMouseOver={function () {
                let audio = new Audio("/audio/bomb.wav");
                setScore(0);
                audio.play();
                bomb.avail = false;
                setBombs([...bombs]);
              }}
            />
          )
        );
      })}
    </div>
  );
}
