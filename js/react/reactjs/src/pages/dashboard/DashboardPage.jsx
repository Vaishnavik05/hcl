import React from 'react'
import { Outlet } from 'react-router-dom'
import './Dashboard.css'

export default function DashboardPage() {
    return <>
        {location.pathname}
        <div className='dashboard-header'>Dashboard Page</div>
        <Outlet />
    </>
}