import React from "react";
import myStyle from "./Button.module.css";

const Button = () => {
    return (
        <button className={myStyle.button}>
            클릭
        </button>
    )
}

export default Button;