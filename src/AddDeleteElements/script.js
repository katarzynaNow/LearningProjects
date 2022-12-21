window.onload = function () {

    let boxContainer = document.getElementById('box-container');

    document.getElementById('add-element').addEventListener('click', function (){
        let newElement = document.createElement('div');
        newElement.classList.add('box');
        boxContainer.appendChild(newElement);
    });

    boxContainer.addEventListener('click', function (e) {
        if (e.target.className.includes('box')) {
            e.target.style.backgroundColor = 'white';
        }
    });

}

