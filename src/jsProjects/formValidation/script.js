window.onload = function () {

    let existUserName = ['admin', 'user'];
    let usernameInput = document.getElementById('username');
    let usernameError = document.getElementById('username-error');

    document.getElementById('form').addEventListener('submit', function (e) {
        e.preventDefault();

        if (validUser()) {
            window.alert('Form submited sucessfully');
        }
    });

    function validUser() {
        let userValid = true;

        if(!checkRequiredInput(usernameInput)){
            userValid = false;
            setErrorText('Enter username.');
        } else if (!checkMinMaxLength(usernameInput, 3 , 12)) {
            userValid = false;
            setErrorText('Username should have from 3 to 12 characters.');
        } else if (checkExistUsername(usernameInput)) {
            userValid = false;
            setErrorText('Username is reserved.');
        } else {
            usernameError.setAttribute('hidden', '');
        }
        return userValid;
    }

    function checkRequiredInput (input) {
        return input.value.length > 0; //
    }

    function checkMinMaxLength(input, min, max) {
        return input.value.length >= min && input.value.length <= max;
    }

    function checkExistUsername (input) {
        return existUserName.includes(input.value);
    }

    function setErrorText(msg) {
        usernameError.textContent = msg;
        usernameError.removeAttribute('hidden');
    }

};