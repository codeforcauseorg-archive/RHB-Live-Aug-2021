import { useKeycloak,  } from "@react-keycloak/web";
import { Redirect } from "react-router";

export default function UserGaurd({children}){
    const { keycloak, initialized } = useKeycloak();

    if (!initialized) {
        return <h1>Loading....</h1>;
      } else if (!keycloak.authenticated) {
        return children;
      } else {
        return <Redirect to="/"/>;
      }
}