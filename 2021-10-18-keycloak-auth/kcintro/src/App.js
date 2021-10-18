import "./App.css";
import Home from "./Home";
import { ReactKeycloakProvider } from '@react-keycloak/web'

import keycloak from "./utils/keycloak";

function App() {
  return (
    <ReactKeycloakProvider authClient={keycloak}>
      <Home />
    </ReactKeycloakProvider>
  );
}

export default App;
