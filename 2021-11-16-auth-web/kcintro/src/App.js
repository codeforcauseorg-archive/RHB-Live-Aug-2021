import "./css/App.css";
import { ReactKeycloakProvider } from '@react-keycloak/web'

import keycloak from "./utils/keycloak";
import Routes from "./Routes";

function App() {
  return (
    <ReactKeycloakProvider authClient={keycloak}>
      <Routes />
    </ReactKeycloakProvider>
  );
}

export default App;
