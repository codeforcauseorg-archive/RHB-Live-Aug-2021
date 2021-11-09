import logo from './logo.svg';
import './App.css';
import CustomAppBar from './components/CustomAppBar';
import SideNav from './components/SideNav';
import { useState } from 'react';

function App() {

  let [navState, setNavState] = useState(false);

  return (
    <div className="App">
     <CustomAppBar setOpen={setNavState}/>
     <SideNav open={navState} setOpen={setNavState}/>
    </div>
  );
}

export default App;
