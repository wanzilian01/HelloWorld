const signUpbotton = document.getElementById("signUp");
const signInbotton = document.getElementById("signIn");
const container = document.getElementById("container");
signUpbotton.addEventListener("click", () => container.classList.add("right-panel-active"));
signInbotton.addEventListener("click", () => container.classList.remove("right-panel-active"));
