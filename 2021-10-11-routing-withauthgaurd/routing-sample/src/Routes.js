import { Switch, Route } from "react-router-dom";
import About from "./About";
import AuthGaurd from "./gaurd/AuthGaurd";
import Login from "./Login";

export default function Routes() {
  return (
    <Switch>
      <Route path="/login">
        <Login />
      </Route>
      <Route path="/">
        <AuthGaurd>
          <About />
        </AuthGaurd>
      </Route>
    </Switch>
  );
}
