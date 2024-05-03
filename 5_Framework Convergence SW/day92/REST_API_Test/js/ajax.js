const url = 'http://localhost:8080/day92/board';
let tbody = document.querySelector('tbody');

// 1. GET
fetch(url, { method: 'get' })
.then(response => response.json())
.then(data => {
    // console.log(data);

    let result = '';

    for (let i = 0; i < data.length; i++) {
        // console.log(`${i} : ${data[i].title}`);
        result += 
                `
                <tr>
                    <td>${data[i].idx}</td>
                    <td>${data[i].title}</td>
                    <td>${data[i].nick}</td>
                    <td>${data[i].v_count}</td>
                    <td>${data[i].w_date}</td>
                </tr>
                `;
    }

    // console.log(result);
    tbody.innerHTML = result;
});


// POST, PATCH, DELETE
let btns = document.querySelectorAll('button');

// 2. POST
btns[0].onclick = () => {
    let title = prompt("제목");
    let contents = prompt("내용");
    let user_idx = Number(prompt("계정번호"))

    let result = {
        "title" : title,
        "contents" : contents,
        "user_idx" : user_idx
    };

    fetch(url, { 
        method: 'post',
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(result)
    })
    .then(response => response.json())
    .then(data => {
        let msg = '작성 실패';

        if (data != 0){
            msg = '작성 완료';
        }

        alert(msg);
        location.reload();
    });
};


// 3. PATCH
btns[1].onclick = () => {
    let title = prompt("제목");
    let idx = prompt("글번호");

    let result = {
        "title" : title,
        "idx" : idx
    };

    fetch(url, { 
        method: 'PATCH',
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(result)
    })
    .then(response => response.json())
    .then(data => {
        let msg = '작성 실패';

        if (data != 0){
            msg = '작성 완료';
        }

        alert(msg);
        location.reload();
    });
};

// 4. DELETE
btns[2].onclick = () => {
    let idx = Number(prompt("글 번호"));

    fetch(url + "?idx=" + idx, { method: 'DELETE'})
    .then(response => response.json())
    .then(data => {
        let msg = '삭제 실패';

        if(data != 0) {
            msg = '삭제 완료';
        }

        alert(msg);
        location.reload();
    })
};