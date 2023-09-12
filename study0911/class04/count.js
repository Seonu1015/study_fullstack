import React, {Component} from 'react';

class count extends Component {
    constructor(props) {
        super(props)
        this.state = {count:0};

        this.handleClickUp = this.handleClickUp.bind(this);
        this.handleClickDown = this.handleClickDown.bind(this);
    }
    handleClickUp() {
        this.setState({count: this.state.count + 1});
    }
    handleClickDown() {
        this.setState({count: this.state.count - 1});
    }
    render() {
        return (
            <div>
                <h2>[COUNT]</h2>
                <p>{this.state.count}번</p>
                <button onClick={this.handleClickUp}>
                    증가
                </button>
                <button onClick={this.handleClickDown}>
                    감소
                </button>
            </div>
        );
    }
}

export default count;