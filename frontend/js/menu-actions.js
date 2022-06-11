const buttonMenuAction = document.getElementById("button-menu-action");
const menuAction = document.getElementById("menu-action");

let hasVisibleMenuAction = false;

buttonMenuAction.addEventListener("click", (event) => {
  event.stopPropagation();
  if (hasVisibleMenuAction) {
    menuAction.classList.add("hidden");
    hasVisibleMenuAction = !hasVisibleMenuAction;
  } else {
    menuAction.classList.remove("hidden");
    hasVisibleMenuAction = !hasVisibleMenuAction;
  }
});

window.onclick = () => {
  if (hasVisibleMenuAction) {
    menuAction.classList.add("hidden");
    hasVisibleMenuAction = !hasVisibleMenuAction;
  }
};
