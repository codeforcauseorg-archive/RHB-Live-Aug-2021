import * as React from "react";
import SwipeableDrawer from "@mui/material/SwipeableDrawer";
import DrawerContent from "./DrawerContent";

export default function SwipeableTemporaryDrawer({
  drawerState,
  setDrawerState,
}) {
  return (
    <div>
      <SwipeableDrawer
        anchor={"left"}
        open={drawerState}
        onClose={() => setDrawerState(false)}
        onOpen={() => setDrawerState(true)}
      >
        <DrawerContent />
      </SwipeableDrawer>
    </div>
  );
}
