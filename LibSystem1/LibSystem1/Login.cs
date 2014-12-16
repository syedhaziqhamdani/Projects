using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace LibSystem1
{
    public partial class Login : Form
    {
        public Login()
        {
            InitializeComponent();
        }
        private bool IsvalidAdmin(string userName, string password)
        {
            DataClasses1DataContext context = new DataClasses1DataContext();
            var q = from p in context.ADMINs
                    where p.NAME == username.Text
                    && p.PASS == password
                    select p;
            if (q.Any())
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        private bool IsvalidUser(string userName, string password)
        {
            DataClasses1DataContext context = new DataClasses1DataContext();
            var q = from p in context.USERs
                    where p.USERNAME == username.Text
                    && p.PASS == password
                    select p;
            if (q.Any())
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        private void button1_Click(object sender, EventArgs e)
        {
            if (username.Text != "" && pass.Text!= "")
            {

                if (IsvalidUser(username.Text, pass.Text))
                {
                    
                    MessageBox.Show("Authenticated User", "Success");
                }
                else if (IsvalidAdmin(username.Text, pass.Text))
                {
                    MessageBox.Show("Authenticated Admin", "Success");
                    AdminHomePage a = new AdminHomePage();
                    a.Show();
                }
            }
            else
            {
                MessageBox.Show("Enter Username/Password.", "Error");
            }
        }
    }
}
