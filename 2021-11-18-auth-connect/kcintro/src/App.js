import "./css/App.css";
import { ReactKeycloakProvider } from "@react-keycloak/web";

import keycloak from "./utils/keycloak";
import Routes from "./Routes";
import axiosKC from "./utils/axiosKC";

const handleOnEvent = async (event, error) => {
  if (event === 'onAuthSuccess') {
    if (keycloak.authenticated) {
      axiosKC.defaults.headers["authorization"] = "Bearer " + keycloak.token;
      console.log(axiosKC.defaults.headers["authorization"]);
    }
  }
}

function App() {
  return (
    <ReactKeycloakProvider
      authClient={keycloak}
      onEvent={(event, error) => handleOnEvent(event, error)}
    >
      <Routes />
    </ReactKeycloakProvider>
  );
}

export default App;
