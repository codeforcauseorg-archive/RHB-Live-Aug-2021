import "./App.css";
import Routes from "./Routes";
import { Link } from "react-router-dom";
import { useHistory } from "react-router-dom";
import React, { useEffect, useState } from "react";
import firebase from "./utils/firebase";
import axios from "./utils/axios";

let UserContext = React.createContext();

function App() {
  let history = useHistory();
  let [user, setUser] = useState();

  useEffect(() => {
    firebase.auth().onAuthStateChanged((user) => {
      console.log(user);
      setUser(user);

      if(user){
        user.getIdToken().then(function(token){
          axios.defaults.headers["Authorization"] = "Bearer "+token;
        })
      }
      
    });
  }, []);

  return (
    <div className="App">
      <UserContext.Provider value={{ user, setUser }}>
        <Routes />
      </UserContext.Provider>
    </div>
  );
}

export { App, UserContext };
