let axios = require("axios");

axios
  .post("http://localhost:8000/", {
    firstName: "Mohit",
    lastName: "Garg",
    tags: ["happy", "sad", "engineer"]
  })
  .then(function (response) {
    console.log(response.data);
  })
  .catch(function (err) {
    console.log(err);
  });
