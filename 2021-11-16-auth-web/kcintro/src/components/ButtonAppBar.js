import * as React from "react";
import AppBar from "@mui/material/AppBar";
import Box from "@mui/material/Box";
import Toolbar from "@mui/material/Toolbar";
import Typography from "@mui/material/Typography";
import Button from "@mui/material/Button";
import IconButton from "@mui/material/IconButton";
import MenuIcon from "@mui/icons-material/Menu";
import { useKeycloak } from "@react-keycloak/web";

export default function ButtonAppBar() {
  const { keycloak, initialized } = useKeycloak();

  let RightButton = function () {
    if (!initialized) {
      return <Button color="inherit">Loading....</Button>;
    } else if (!keycloak.authenticated) {
      return (
        <Button
          onClick={function () {
            console.log(keycloak);
            keycloak.login();
          }}
          color="inherit"
        >
          Login
        </Button>
      );
    } else {
      return (
        <Button
          onClick={function () {
            console.log(keycloak);
            keycloak.logout();
          }}
          color="inherit"
        >
          Logout
        </Button>
      );
    }
  };

  return (
    <AppBar position="static">
      <Toolbar>
        <IconButton
          size="large"
          edge="start"
          color="inherit"
          aria-label="menu"
          sx={{ mr: 2 }}
        >
          <MenuIcon />
        </IconButton>
        <Typography variant="h6" component="div" sx={{ flexGrow: 1 }}>
          News
        </Typography>

        <RightButton/>
      </Toolbar>
    </AppBar>
  );
}
