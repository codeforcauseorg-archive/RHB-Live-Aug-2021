import "./App.css";
import React, { useState } from "react";
import EditView from "./views/EditView";

let FormContext = React.createContext();

function App() {
  let empty = {
    heading: "Untitled form",
    description: "",
    questions: [],
  };

  let [form, setForm] = useState(empty);

  return (
    <div className="App">
      <FormContext.Provider value={{ form, setForm }}>
        <EditView />
      </FormContext.Provider>
    </div>
  );
}

export { App, FormContext };
