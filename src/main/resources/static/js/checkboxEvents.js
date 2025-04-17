document.addEventListener("DOMContentLoaded", function () {
  const checkboxes = document.querySelectorAll(".enlace-checkbox");

  checkboxes.forEach((checkbox) => {
    checkbox.addEventListener("change", function () {
      const url = this.getAttribute("data-href");
      if (url) {
        window.location.href = url;
      }
    });
  });
});
