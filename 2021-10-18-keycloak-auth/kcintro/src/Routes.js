import { Switch, Route } from "react-router-dom";
import AuthGaurd from "./gaurds/AuthGaurd";
import UserGaurd from "./gaurds/UserGaurd";
import Home from "./Home";
import Login from "./Login";

export default function Routes() {
  return (
    <Switch>
      <Route path="/" exact>
        <AuthGaurd>
          <Home />
        </AuthGaurd>
      </Route>
      <Route path="/login">
        <UserGaurd>
          <Login />
        </UserGaurd>
      </Route>
    </Switch>
  );
}
