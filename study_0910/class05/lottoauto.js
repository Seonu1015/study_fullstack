import React, { Component } from 'react';

class lottoauto extends Component {
    constructor(props) {
        super(props)
        this.state = { lotto: [], count: 0 };

        this.handleClick = this.handleClick.bind(this);
    }

    handleClick() {
        if(this.state.count < 6) {
            const newNumber = Math.floor(Math.random() * 45 + 1);
            // if(number in this.state.lotto !== newNumber) {
                this.setState({ lotto: [...this.state.lotto, newNumber], count: this.state.count + 1 });
            // } else {
            //     this.setState({ lotto: [...this.state.lotto], count: this.state.count - 1 });
            // }
        }
        if (this.state.count === 6) {
            alert('로또 번호(자동) : ' + this.state.lotto.join(', '));
        }
    }

    render() {
        return (
            <div>
                <h2>[LOTTO]</h2>
                <p>
                    NUMBER :{this.state.lotto.join(', ')}
                </p>
                <button onClick={this.handleClick}>
                    자동
                </button>
            </div>
        );
    }
}

export default lottoauto;