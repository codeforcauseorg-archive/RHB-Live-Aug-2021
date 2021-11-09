import { Button, Drawer } from "@mui/material";
import BasicList from "./BasicList";

export default function SideNav({ open, setOpen }) {
  return (
    <Drawer anchor="left" open={open} onClose={() => setOpen(false)}>
      <div style={{
          width: "300px"
      }}>
        <BasicList/>
      </div>
    </Drawer>
  );
}
