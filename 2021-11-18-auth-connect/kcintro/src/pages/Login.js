import { useKeycloak } from "@react-keycloak/web";

export default function Login() {
  const { keycloak } = useKeycloak();

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
}
