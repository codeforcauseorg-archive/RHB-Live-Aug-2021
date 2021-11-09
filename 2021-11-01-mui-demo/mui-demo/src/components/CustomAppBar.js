import { AppBar, Button, IconButton, Toolbar, Typography } from "@mui/material";
import MenuIcon from "@mui/icons-material/Menu";

export default function CustomAppBar({setOpen}) {
  return (
    <AppBar>
      <Toolbar>
        <div
          style={{
            width: "100vw",
            display: "flex",
            alignItems: "center",
          }}
        >
          <IconButton
            style={{
              color: "#ffffff",
              marginRight: "16px",
            }}
            onClick={function(){
                setOpen((open) => !open);
            }}
          >
            <MenuIcon />
          </IconButton>
          <Typography variant="h5" style={{
              flexGrow: 1
          }}>Home</Typography>
          <Button variant="outlined" style={{
              color: "#ffffff",
          }}>Signout</Button>
        </div>
      </Toolbar>
    </AppBar>
  );
}
