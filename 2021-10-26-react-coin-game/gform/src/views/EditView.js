import { Button, Switch, TextField } from "@mui/material";
import { useContext } from "react";
import { FormContext } from "../App";
import "../css/edit.css";

export default function EditView() {
  let { form, setForm } = useContext(FormContext);

  return (
    <div>
      <div id="topedit">
        <TextField
          id="formheadingedit"
          variant="standard"
          value={form.heading}
          onChange={(event) => {
            let copy = { ...form };
            copy.heading = event.target.value;
            setForm(copy);
          }}
        />

        <TextField
          id="formdescedit"
          variant="standard"
          value={form.description}
          onChange={(event) => {
            let copy = { ...form };
            copy.description = event.target.value;
            setForm(copy);
          }}
        />
      </div>

      {form.questions.map(function (question, index) {
        return (
          <div class="qdivedit">
            <TextField
              class="questionedit"
              variant="standard"
              value={question.title}
              onChange={(event) => {
                question.title = event.target.value;
                let copy = { ...form };
                setForm(copy);
              }}
            />

            <Switch
              onChange={function (event) {
                question.required = event.target.checked;
                let copy = { ...form };
                setForm(copy);
              }}
            />
          </div>
        );
      })}

      <Button
        onClick={function () {
          let copy = { ...form };
          copy.questions.push({
            title: "Untitled Question",
            type: "text",
            required: true,
          });
          setForm(copy);
        }}
      >
        Add Question
      </Button>
    </div>
  );
}
