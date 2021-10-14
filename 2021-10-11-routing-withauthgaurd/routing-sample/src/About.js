import axios from "./utils/axios";
import { useContext } from "react";
import { UserContext } from "./App";
import firebase from "./utils/firebase";

export default function About() {
  let { user } = useContext(UserContext);

  return (
    <div>
      <h1>This is about page of {user.displayName}</h1>
      <img src={user.photoURL}></img>
      <button
        onClick={function () {
          firebase.auth().signOut();
        }}
      >
        Logout
      </button>

      <button
        onClick={function () {
          axios.get("http://localhost:8000/").then(function(response){
            console.log(response);
          })
        }}
      >
        Ping Server
      </button>
    </div>
  );
}
