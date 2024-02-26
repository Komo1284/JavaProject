class Unit {
    constructor(name, hp, atk) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }

    show() {
        let msg = `${this.name} (hp ${this.hp}, atk ${this.atk})`;
        return msg;
    }

    attack(tar) {
        tar.hp -= this.atk;
    }
}