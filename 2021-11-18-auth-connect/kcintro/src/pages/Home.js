import { Button } from "@mui/material";
import { useKeycloak } from "@react-keycloak/web";
import axiosKC from "../utils/axiosKC";

export default function Home() {
  const { keycloak } = useKeycloak();

  return (
    <div>
      <h1>You are logged in</h1>
      <h3> Name: {keycloak.idTokenParsed.name}</h3>
      <h3> Email: {keycloak.idTokenParsed.email}</h3>
      <Button
        variant="contained"
        onClick={() => {
          axiosKC
            .get("http://localhost:5030/api/user/")
            .then(function (response) {
              console.log(response.data);
            })
            .catch(function (err) {
              console.log(err);
            });
        }}
      >
        Ping
      </Button>
    </div>
  );
}
