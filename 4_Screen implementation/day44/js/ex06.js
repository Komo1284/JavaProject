// <script> 태그 내라고 생각하면 좋다
function rev(n) {
    let result = 0;

    while (n != 0) {
        result = result * 10 + n % 10;
        n = parseInt(n / 10);
    }

    return result;
}

function fill(tag) {
    return function() {
        tag.style.backgroundColor = 'red';
    }
}

let stu = {
    name: '홍길동',
    kor: 70,
    eng: 80,
    mat: 98,

    show: function() {
        let msg = 
            `${this.name} 국 ${this.kor} ` +
            `영 ${this.eng} 수 ${this.mat}`;
        
        return msg;
    },

    total: function() {
        return this.kor + this.eng + this.mat;
    },

    avg: function() {
        let result = this.total() / 3;
        result = Math.round(result * 10) / 10;

        return result;
    }
}