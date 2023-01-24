window.onload = function () {
    let boxContainer = document.getElementById('box-container');
    let numberOfColumnsError = document.getElementById('error-columns');
    let numberOfRowsError = document.getElementById('error-rows');

    document.getElementById('create').addEventListener('click', function (e){

        let rowsNumber = document.getElementById('rows-number').value;
        let columnsNumber = document.getElementById('columns-number').value;

        if (!checkNumberOfColumns(columnsNumber, 0, 10)) {
            rowsNumber = columnsNumber = 0;
            setColumnsErrorText('Enter number of columns from 0 to 10.');
        }
        if (!checkNumberOfRows(rowsNumber, 0, 10)) {
            rowsNumber = columnsNumber = 0;
            setRowsErrorText('Enter number of rows from 0 to 10.');
        }

       for (let i = 0; i < rowsNumber; i++) {
           let newElement = document.createElement('div');
           newElement.classList.add('row');
           boxContainer.appendChild(newElement);
            for (let j = 0; j < columnsNumber; j++) {
                let box = document.createElement('div');
                box.classList.add('box');
                newElement.appendChild(box);

                let color = document.getElementById('colors').value;
                console.log(color);
                box.style.backgroundColor = color;
           }
       }
    });

    document.getElementById('delete').addEventListener('click', function (){
            boxContainer.replaceChildren(document.getElementsByClassName('box'));
    });

    function checkNumberOfColumns (inputCol, min, max) {
         return inputCol >= min && inputCol <= max;
    }

    function checkNumberOfRows (inputRow, min, max) {
        return inputRow >= min && inputRow <= max;
    }

    function setColumnsErrorText(msg) {
        numberOfColumnsError.textContent = msg;
        numberOfColumnsError.removeAttribute('hidden');
    }

    function setRowsErrorText(msg) {
        numberOfRowsError.textContent = msg;
        numberOfRowsError.removeAttribute('hidden');
    }
}


