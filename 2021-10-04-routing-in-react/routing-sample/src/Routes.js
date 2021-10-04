import { Switch, Route } from "react-router-dom";

export default function Routes() {
  return (
    <Switch>
      <Route path="/about">
        <h1>About page</h1>
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
