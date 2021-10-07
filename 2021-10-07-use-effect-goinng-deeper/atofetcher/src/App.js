import "./App.css";

import react, { useEffect, useState } from "react";
import axios from "axios";
import UserData from "./UserData";

let UserContext = react.createContext();

function App() {
  let empty = {
    avatar_url:
      "https://ichef.bbci.co.uk/news/976/cpsprodpb/4FA0/production/_108848302_a0d15811-30d8-4a51-8dd3-ab45f3dbc387.jpg",
    name: "Kungfu Panda",
    bio: "I choose my destiny",
  };

  let [username, setUsername] = useState("");
  let [user, setUser] = useState(empty);

  useEffect(
    function () {
      axios
        .get("https://api.github.com/users/" + username)
        .then(function (response) {
          let data = response.data;
          setUser({
            name: data.name,
            avatar_url: data.avatar_url,
            bio: data.bio,
          });
          // console.log(response.data);
        })
        .catch(function (error) {
          console.log("No user with username " + username);
        });
    },
    [username]
  );

  return (
    <div className="App">
      <input
        value={username}
        onChange={function (event) {
          setUsername(event.target.value);
        }}
      ></input>

      <UserContext.Provider value={{ user, setUser }}>
        <div>
          <UserData />
        </div>
      </UserContext.Provider>
    </div>
  );
}

export { App, UserContext };
