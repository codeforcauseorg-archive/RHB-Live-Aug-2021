import { useKeycloak } from "@react-keycloak/web";

export default function Home() {
  const { keycloak, initialized } = useKeycloak();

  console.log(keycloak);

  if (!initialized) {
    return <h1>Loading....</h1>;
  } else if (!keycloak.authenticated) {
    return (
      <div>
        <button
          onClick={function () {
            console.log(keycloak);
            keycloak.login();
          }}
        >
          Login
        </button>
      </div>
    );
  } else {
    return (
      <div>
        <h1>You are logged in</h1>
        <h3> Name: {keycloak.idTokenParsed.name}</h3>
        <h3> Email: {keycloak.idTokenParsed.email}</h3>
        <button
          onClick={function () {
            console.log(keycloak);
            keycloak.logout();
          }}
        >
          Logout
        </button>
      </div>
    );
  }
}
