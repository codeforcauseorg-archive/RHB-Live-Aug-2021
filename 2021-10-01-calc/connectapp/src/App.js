import logo from "./logo.svg";
import "./App.css";
import axios from "axios";
import { useState } from "react";

function App() {
  let empty = {
    name: "",
    avatar_url:
      "https://files.worldwildlife.org/wwfcmsprod/images/Panda_in_Tree/hero_small/99i33zyc0l_Large_WW170579.jpg",
    company: "",
  };

  let [username, setUsername] = useState("");
  let [user, setUser] = useState(empty);
  return (
    <div className="App">
      <input
        value={username}
        name="myusername"
        onChange={function (event) {
          setUsername(event.target.value);
        }}
      ></input>
      <h1>{username}</h1>
      <buttton
        onClick={function () {
          axios
            .get("https://api.github.com/users/" + username)
            .then(function (resposne) {
              setUser(resposne.data);
            });
        }}
      >
        Fetch
      </buttton>

      <div>
        <h1>{user.name}</h1>
        <img src={user.avatar_url} height="200px"/>
        <h3>{user.company}</h3>
      </div>
    </div>
  );
}

export default App;
