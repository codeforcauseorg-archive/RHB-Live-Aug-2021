import { Switch, Route } from "react-router-dom";
import About from "./About";
import Login from "./Login";

export default function Routes() {
  return (
    <Switch>
      <Route path="/login">
        <Login />
      </Route>
      <Route path="/about">
        <About />
      </Route>
      <Route path="/users">
        <h1>Users page</h1>
      </Route>
      <Route path="/">
        <h1>Home page</h1>
      </Route>
    </Switch>
  );
}
