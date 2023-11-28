function submitForm() {
  // Get form values
  const firstName = document.getElementById("firstName").value;
  const lastName = document.getElementById("lastName").value;
  const dob = document.getElementById("dob").value;
  const country = document.getElementById("country").value;
  const gender = getSelectedGender();
  const profession = document.getElementById("profession").value;
  const email = document.getElementById("email").value;
  const mobile = document.getElementById("mobile").value;

  // Validate the form
  if (validateForm()) {
    // Display popup with form submission details
    const resultString = `
            <p><strong>First Name:</strong> ${firstName}</p>
            <p><strong>Last Name:</strong> ${lastName}</p>
            <p><strong>Date of Birth:</strong> ${dob}</p>
            <p><strong>Country:</strong> ${country}</p>
            <p><strong>Gender:</strong> ${gender}</p>
            <p><strong>Profession:</strong> ${profession}</p>
            <p><strong>Email:</strong> ${email}</p>
            <p><strong>Mobile Number:</strong> ${mobile}</p>
        `;
    document.getElementById("popupResult").innerHTML = resultString;

    // Display the popup
    document.getElementById("popup").style.display = "block";

    // Reset the form after displaying the popup
    resetForm();
  }
}

function resetForm() {
  // Reset all form fields
  document.getElementById("surveyForm").reset();
}

function closePopup() {
  // Close the popup
  document.getElementById("popup").style.display = "none";
}

function validateForm() {
  // Implement your validation logic here
  // For simplicity, this example assumes all fields are required
  const form = document.getElementById("surveyForm");
  return form.checkValidity();
}

function getSelectedGender() {
  const maleCheckbox = document.getElementById("male");
  const femaleCheckbox = document.getElementById("female");

  if (maleCheckbox.checked && femaleCheckbox.checked) {
    return "Both";
  } else if (maleCheckbox.checked) {
    return "Male";
  } else if (femaleCheckbox.checked) {
    return "Female";
  } else {
    return "Not Specified";
  }
}
