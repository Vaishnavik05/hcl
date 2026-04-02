import React from 'react'
import { Link } from 'react-router-dom'
export default function HomePage() {
    return <>
        <header>
            <nav>
                <h1>Amazon</h1>
                <ul>
                    <li><Link to='/login'>Login</Link></li>
                    <li><Link to='/register'>Register</Link></li>
                </ul>
            </nav>
        </header>
    </>
}
