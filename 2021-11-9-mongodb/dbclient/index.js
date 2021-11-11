let axios = require("axios");

axios
  .post("http://localhost:8000/", {
    firstName: "Mohit",
    lastName: "Garg",
    tags: ["happy", "sad", "engineer"],
    subjects: [
      {
        name: "Maths",
        score: 80,
      },
      {
        name: "Physics",
        score: 86,
      },
      {
        name: "Chem",
        score: 95,
      },
    ],
  })
  .then(function (response) {
    console.log(response.data);
  })
  .catch(function (err) {
    console.log(err);
  });
