import React from 'react'
import './Login.css'
import { useNavigate } from 'react-router-dom'

export default function LoginPage() {
    const [email, setEmail] = React.useState('')
    const [password, setPassword] = React.useState('')

    const navigate = useNavigate()

    const handleSubmit = () => {
        console.log('Logging in...')
        setTimeout(() => {
            console.log('Logged in successfully!')
            navigate('/')
        }, 2000)
    }

    return <div className='login-page'>
        <h1>Login</h1>
        <div className='login-form'>
            <input type="email" placeholder='john@example.com' value={email} onChange={(e) => setEmail(e.target.value)} required/>
            <input type="password" placeholder='*******' value={password} onChange={(e) => setPassword(e.target.value)} required/>
            <button onClick={handleSubmit}>Login</button>
        </div>
    </div>
}
