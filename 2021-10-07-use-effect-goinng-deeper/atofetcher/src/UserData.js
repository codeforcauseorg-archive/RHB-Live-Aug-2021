import { useContext } from "react";
import { UserContext } from "./App";

export default function UserData() {
  let { user } = useContext(UserContext);
  return (
    <div>
      <h1>{user.name}</h1>
      <h4>{user.bio}</h4>
      <img alt={user.name} src={user.avatar_url} height="200px"></img>
    </div>
  );
}
