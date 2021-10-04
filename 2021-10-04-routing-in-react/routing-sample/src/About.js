import { useContext } from "react";
import { UserContext } from "./App";

export default function About() {
  let { user } = useContext(UserContext);
  return (
    <div>
      <h1>This is about page of {user ? user.displayName : "Someone"}</h1>
      {user && <img src={user.photoURL}></img>}
    </div>
  );
}
