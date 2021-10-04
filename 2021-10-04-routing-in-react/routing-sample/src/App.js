import "./App.css";
import Routes from "./Routes";
import { Link } from "react-router-dom";
import { useHistory } from "react-router-dom";
import React, { useEffect, useState } from "react";
import firebase from "./utils/firebase";

let UserContext = React.createContext();

function App() {
  let history = useHistory();
  let [user, setUser] = useState();

  useEffect(() => {
    firebase.auth().onAuthStateChanged((user) => {
      console.log(user);
      setUser(user);
    });
  }, []);

  return (
    <div className="App">
      <button
        onClick={function () {
          history.push("/");
        }}
      >
        Go to home
      </button>
      <button
        onClick={function () {
          history.push("/users");
        }}
      >
        Go to Users
      </button>
      <h1>
        <Link to="/about">About</Link>
      </h1>

      <UserContext.Provider value={{ user, setUser }}>
        <Routes />
      </UserContext.Provider>
    </div>
  );
}

export { App, UserContext };
