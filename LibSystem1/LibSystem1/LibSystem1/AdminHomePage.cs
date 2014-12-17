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
    public partial class AdminHomePage : Form
    {
        public AdminHomePage()
        {

            Login s = new Login();
            s.Hide();
            InitializeComponent();
        }

        private void btnmember_Click(object sender, EventArgs e)
        {
            Emember obj = new Emember();
            obj.Show();
        }

        private void btnbooks_Click(object sender, EventArgs e)
        {
            Ebooks obj = new Ebooks();
            obj.Show();
        }

        private void btnbooksissued_Click(object sender, EventArgs e)
        {
            Ebooksissued obj = new Ebooksissued();
            obj.Show();
        }

        private void btnauthor_Click(object sender, EventArgs e)
        {
            Eauthor obj = new Eauthor();
            obj.Show();
        }

        private void AdminHomePage_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            adminUserReg a = new adminUserReg();
            a.ShowDialog();
        }
    }
}
