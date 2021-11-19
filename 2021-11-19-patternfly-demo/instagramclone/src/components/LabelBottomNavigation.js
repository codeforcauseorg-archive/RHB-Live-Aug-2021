import * as React from "react";
import BottomNavigation from "@mui/material/BottomNavigation";
import BottomNavigationAction from "@mui/material/BottomNavigationAction";
import FolderIcon from "@mui/icons-material/Folder";
import RestoreIcon from "@mui/icons-material/Restore";
import FavoriteIcon from "@mui/icons-material/Favorite";
import LocationOnIcon from "@mui/icons-material/LocationOn";
import { useNavigate } from "react-router-dom";

export default function LabelBottomNavigation() {
  const [value, setValue] = React.useState("recents");
  let navigate = useNavigate();

  const handleChange = (event, newValue) => {
    setValue(newValue);
    navigate(newValue);
  };

  return (
    <BottomNavigation sx={{ width: 500 }} value={value} onChange={handleChange}>
      <BottomNavigationAction label="Home" value="/" icon={<RestoreIcon />} />
      <BottomNavigationAction
        label="Search"
        value="/search"
        icon={<FavoriteIcon />}
      />
      <BottomNavigationAction
        label="Add"
        value="/add"
        icon={<LocationOnIcon />}
      />
      <BottomNavigationAction
        label="Like"
        value="/likes"
        icon={<LocationOnIcon />}
      />
      <BottomNavigationAction
        label="Profile"
        value="/profile"
        icon={<FolderIcon />}
      />
    </BottomNavigation>
  );
}
