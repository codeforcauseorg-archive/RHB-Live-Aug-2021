import logo from "./logo.svg";
import Button from "@mui/material/Button";
import ButtonGroup from "@mui/material/ButtonGroup";
import Avatar from "@mui/material/Avatar";
import ButtonAppBar from "./ButtonAppBar";
import SwipeableTemporaryDrawer from "./SwipeableTemporaryDrawer";
import { useState } from "react";

function App() {

  let [drawerState, setDrawerState] = useState(false);

  return (
    <div className="App">
      <ButtonAppBar drawerState={drawerState} setDrawerState={setDrawerState}/>
      <SwipeableTemporaryDrawer drawerState={drawerState} setDrawerState={setDrawerState}/>
      {/* <ButtonGroup
        variant="contained"
        aria-label="outlined primary button group"
      >
        <Button>One</Button>
        <Button disabled>Two</Button>
        <Button>Three</Button> */}
      {/* </ButtonGroup>

      <Avatar alt="Remy Sharp" src="https://mui.com//static/images/avatar/1.jpg" />
      <Avatar alt="Travis Howard" src="https://mui.com//static/images/avatar/2.jpg" />
      <Avatar alt="Cindy Baker" src="/static/images/avatar/3.jpg" /> */}
    </div>
  );
}

export default App;
