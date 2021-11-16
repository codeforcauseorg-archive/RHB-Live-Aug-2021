import { Switch, Route } from "react-router-dom";
import AuthGaurd from "./gaurds/AuthGaurd";
import UserGaurd from "./gaurds/UserGaurd";
import BaseLayout from "./layouts/BaseLayout";
import Home from "./pages/Home";
import Login from "./pages/Login";

export default function Routes() {
  return (
    <Switch>
      <Route path="/" exact>
        <BaseLayout>
          <AuthGaurd>
            <Home />
          </AuthGaurd>
        </BaseLayout>
      </Route>
      <Route path="/login">
        <BaseLayout>
          <UserGaurd>
            <Login />
          </UserGaurd>
        </BaseLayout>
      </Route>
    </Switch>
  );
}
