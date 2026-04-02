import {Routes} from 'react-router-dom'
import {Route} from 'react-router-dom'
import HomePage from './pages/HomePage'
import LoginPage from './pages/LoginPage'
import RegisterPage from './pages/RegisterPage'
import ProfilePage from './pages/ProfilePage'
import DashboardPage from './pages/dashboard/DashboardPage'
import SettingsPage from './pages/dashboard/SettingsPage'
import OverviewPage from './pages/dashboard/OverviewPage'
import ProtectedRoute from './components/ProtectedRoute'

export default function App() {
  return <>
    <Routes>
      <Route path='/' element={<HomePage />} />
      <Route path='/login' element={<LoginPage />} />
      <Route path='/register' element={<RegisterPage />} />
      <Route path='/dashboard' element={<ProtectedRoute><DashboardPage /></ProtectedRoute>} >
          <Route path='overview' element={<OverviewPage />} />
          <Route path='settings' element={<SettingsPage />} />
      </Route>
      <Route path='/profile/:id' element={<ProfilePage />} />
      <Route path='*' element={<h1>404 Not Found</h1>} />
    </Routes>
  </>
}