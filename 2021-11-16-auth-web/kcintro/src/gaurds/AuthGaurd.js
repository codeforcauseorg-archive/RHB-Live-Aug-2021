import { useKeycloak } from "@react-keycloak/web";
import { Redirect } from "react-router";

export default function AuthGaurd({ children }) {
  const { keycloak, initialized } = useKeycloak();
  if (!initialized) {
    return <h1>Loading....</h1>;
  } else if (!keycloak.authenticated) {
    return <Redirect to="/login" />;
  } else {
    return children;
  }
}
