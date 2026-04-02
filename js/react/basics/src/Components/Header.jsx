import React,{useContext} from 'react'
import ThemeContext from '../Context/ThemeContext'

export default function Header() {
    const { theme, setTheme } = React.useContext(ThemeContext);
    return <>
        <nav style={{ backgroundColor: theme === 'light' ? 'white' : 'black', color: theme === 'light' ? 'black' : 'white' }}>
            <h1>Flipkart</h1>
            <ul>
                <li><a href="#">Home</a></li>
                <li><a href="#">Products</a></li>
                <li><a href="#">Profile</a></li>
            </ul>
        </nav>
    </>
}