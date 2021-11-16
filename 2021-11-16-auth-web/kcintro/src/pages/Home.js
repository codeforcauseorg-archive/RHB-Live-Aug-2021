import { useKeycloak } from "@react-keycloak/web";

export default function Home() {
  const { keycloak } = useKeycloak();

  return (
    <div>
      <h1>You are logged in</h1>
      <h3> Name: {keycloak.idTokenParsed.name}</h3>
      <h3> Email: {keycloak.idTokenParsed.email}</h3>
    </div>
  );
}
