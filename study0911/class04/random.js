import React, { Component } from 'react';

class random extends Component {
    constructor(props) {
        super(props)
        this.state = { randomNumber1: 0, randomNumber2: 0 };
        
        this.handleClick1 = this.handleClick1.bind(this);
        this.handleClick2 = this.handleClick2.bind(this);
    }

    handleClick1() {
        this.state = { randomNumber: 0 };
        this.setState({ randomNumber1: Math.floor(Math.random() * 45 + 1) });
    }

    handleClick2() {
        this.setState({ randomNumber2: Math.floor(Math.random() * 45 + 1) });
    }

    render() {
        return (
            <div>
                <h2>[LOTTO]</h2>
                <button onClick={this.handleClick1}>
                    {this.state.randomNumber1}
                </button>
                <button onClick={this.handleClick2}>
                    {this.state.randomNumber2}
                </button>
            </div>
        );
    }
}

export default random;