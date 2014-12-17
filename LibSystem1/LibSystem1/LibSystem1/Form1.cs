using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace LibSystem1
{
    public partial class adminUserReg : Form
    {
        public adminUserReg()
        {
            InitializeComponent();
        }
        private bool IsvalidAdmin(string userName, string password)
        {
            DataClasses1DataContext context = new DataClasses1DataContext();
            var q = from p in context.ADMINs
                    where p.NAME == userName
                    select p;
            if (q.ToString().Equals(userName))
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        private bool IsvalidUser(string userName, string password)
        {
            DataClasses1DataContext context = new DataClasses1DataContext();
            var q = from p in context.USERs
                    where p.USERNAME == userName
                    select p;
            if (q.ToString().Equals(userName))
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        private void reg_Click(object sender, EventArgs e)
        {
            if (IsUsername(user.Text) && IsvalidAdmin(user.Text, pass.Text))
            {
                using (DataClasses1DataContext myDb = new DataClasses1DataContext())
                {
                    myDb.ADMINs.InsertOnSubmit(new ADMIN
                    {
                        NAME = user.Text,
                        PASS = pass.Text,
                    });
                    myDb.SubmitChanges();
                }
                MessageBox.Show("Admin registered.");
            }
            else
            {
                MessageBox.Show("Error.");
            }

        }

        public static bool IsUsername(string username)
        {
            string pattern;
            pattern = @"^[a-zA-Z][a-zA-Z0-9]{5,11}$";

            Regex regex = new Regex(pattern);
            return regex.IsMatch(username);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (IsUsername(user.Text) && IsvalidAdmin(user.Text, pass.Text))
            {
                using (DataClasses1DataContext myDb = new DataClasses1DataContext())
                {
                    myDb.ADMINs.InsertOnSubmit(new ADMIN
                    {
                        NAME = user.Text,
                        PASS = pass.Text,
                    });
                    myDb.SubmitChanges();
                }
                MessageBox.Show("User registered.");

            }
            else
            {
                MessageBox.Show("Error.");
            }
        }
    }
}
